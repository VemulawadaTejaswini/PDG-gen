import java.util.*;

public class Main{
    public static void main (String args[]){

        //初期処理
        Scanner sc=new Scanner(System.in);
        // int n=Integer.parseInt(sc.nextLine());
        // String[] sArray = sc.nextLine().split(" ");
        // int[] array=Arrays.stream(sArray).mapToInt(Integer::parseInt).toArray();

        int n = Integer.parseInt(sc.nextLine());
        String[] S = sc.nextLine().split(" ");
        int q = Integer.parseInt(sc.nextLine());
        String[] T = sc.nextLine().split(" ");
        int answer = 0;
        
        for (int i=0;i<T.length;i++){
            ArrayList<String> SwithSentinel=new ArrayList<>(Arrays.asList(S));
            SwithSentinel.add(T[i]);
            int j=0;
            while (!T[i].equals(SwithSentinel.get(j)) ) {
                j++;
            }
            if (j==n) {
                continue;
            } else {
                answer++;
            }
        }

        

            System.out.println(answer);
        // String[] sArray2 = Arrays.stream(array).mapToObj(Integer::toString).toArray(s->new String[s]);
        // System.out.println(String.join(" ", sArray2));
        // System.out.println(count);
    }
}

