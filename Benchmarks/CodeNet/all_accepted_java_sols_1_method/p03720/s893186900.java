    import java.util.Scanner;
     
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] path_count  = new int[N];
            for(int i=0;i<M;i++){
                path_count[sc.nextInt()-1]++;
                path_count[sc.nextInt()-1]++;
            }
            for(int path:path_count)
                System.out.println(path);
        }
    }