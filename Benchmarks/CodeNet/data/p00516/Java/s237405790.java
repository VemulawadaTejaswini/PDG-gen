import java.util.Scanner;
     
    public class main {
         
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
 
        int n = s.nextInt();
        int m = s.nextInt();
        int[] A = new int[n];
        int[] a_= new int[n];
        int[] b = new int[m];
        int answer = 0;
         
        for(int i = 0;i < n;i++){
            A[i] = s.nextInt();
            }
         
        for(int i = 0;i < m;i++){
            b[i] = s.nextInt();
            }
         
        for(int i = 0;i < m;i++){
            int s = b[i];
            for(int j = 0;j < n;j++){
                if(s >= A[j]){
                    a_[j]++;
                    break;
                    }
                }
            }
         
        int max = a_[0];
         
        for(int i = 0;i < n;i++){
            if(max <= a_[i]){
                max = a_[i];
                answer = i + 1;
                }
            }
        System.out.print(answer);
        }
    }