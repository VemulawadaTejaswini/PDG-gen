import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int[] array = new int[0];
    private static int last = 0;
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        try {
            int arg, n;
            String line, command;
            n = Integer.parseInt(br.readLine());
            array = new int[0];
            for (int i = 0; i < n ; i++) {
                line = br.readLine();
                st = new StringTokenizer(line);
                command = st.nextToken();
                switch(command){
                    case "insert":
                        arg = Integer.parseInt(st.nextToken());
                        insert(arg);
                        break;
                    case "delete":
                        arg = Integer.parseInt(st.nextToken());
                        delete(arg);
                        break;
                    case "deleteFirst":
                        deleteFirst();
                        break;
                    case "deleteLast":
                        deleteLast();
                        break;
                }
            }
            for (int i=0 ; i<last; i++) {
                sb.append(array[i]).append(" ");
            }
            System.out.println(sb.toString().trim());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void insert(int arg){
        int[] tempArray = new int[last+1];
        tempArray[0] = arg;
        System.arraycopy(array, 0, tempArray, 1, last);
        array = tempArray;
        last++;
    }

    private static void delete(int arg){
        int[] tempArray = new int[last-1];
        boolean exist = false;
        int pos = 0;
        for (int j = 0; j < last; j++) {
            if (array[j] == arg){
                pos = j;
                if(pos==0){
                    deleteFirst();
                    return;

                }else if(pos == last-1){
                    deleteLast();
                    return;
                }
                exist = true;
                break;
            }
        }
        if (!exist){
            return;
        }
        System.arraycopy(array, 0, tempArray, 0, pos);
        System.arraycopy(array, pos + 1, tempArray, pos, last - pos - 1);
        array = tempArray;
        last--;
    }

    private static void deleteFirst(){
        int[] tempArray = new int[last-1];
        System.arraycopy(array, 1, tempArray, 0, last-1);
        array = tempArray;
        last--;
    }

    private static void deleteLast(){
        int[] tempArray = new int[last-1];
        System.arraycopy(array, 0, tempArray, 0, last-1);
        array = tempArray;
        last--;
    }
}