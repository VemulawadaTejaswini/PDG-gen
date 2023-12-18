import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    static final char DOWN = '\\';
    static final char UP = '/';
    static final char FLAT = '_';
    
    private static class Data {
        public int start;
        public int end;
        public int area;
        
        public Data(int start, int end, int area) {
            this.start = start;
            this.end = end;
            this.area = area;
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> resolvedList = new LinkedList();
        LinkedList<Integer> slopeStack = new LinkedList();
        LinkedList<Data> unresolvedStack = new LinkedList();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String landForm = br.readLine();

        for(int pos = 0; pos < landForm.length(); pos++) {
            if(landForm.charAt(pos) == DOWN) {
                slopeStack.add(pos);
                continue;
            } else if(landForm.charAt(pos) == FLAT) {
                continue;
            }
            
            // UP
            if(slopeStack.size() == 0) {
                while(unresolvedStack.size() != 0) {
                    Data data = unresolvedStack.removeFirst();
                    resolvedList.add(data.area);
                }
                continue;
            }

            int before = slopeStack.removeLast();
            Data data = new Data(before, pos, pos - before);
            while(true) {
                if(unresolvedStack.size() == 0) {
                    unresolvedStack.add(data);
                    break;
                }

                Data beforeData = unresolvedStack.removeLast();
                if(beforeData.start > data.start && beforeData.end < data.end) {
                    data.area += beforeData.area;
                } else {
                    unresolvedStack.add(beforeData);
                    unresolvedStack.add(data);
                    break;
                }
            }
        }
        
        int sum = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();

        ListIterator<Integer> itr = resolvedList.listIterator(0);
        while(itr.hasNext()) {
            int l = itr.next().intValue();
            sum += l;
            count++;

            if(sb.length() != 0) {
                sb.append(" ");
            }

            sb.append(l);
        }

        ListIterator<Data> unItr;
        unItr = unresolvedStack.listIterator(0);
        while(unItr.hasNext()) {
            int l = unItr.next().area;
            sum += l;
            count++;

            if(sb.length() != 0) {
                sb.append(" ");
            }

            sb.append(l);
        }
        System.out.println(sum);
        System.out.print(count);
        if(count == 0) {
            System.out.println();
        } else {
            System.out.println(" " + sb.toString());
        }
    }
}