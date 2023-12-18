import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = sc.nextInt();
            
            	if(n == 0)break;
            
            int[] student = new int[n];
            
            for(int i=0;i<n;i++){
                student[i] = sc.nextInt();
            }
            
            double sum = 0;
            double avg = 0;
            for(int i=0;i<n;i++){
                avg += student[i];
            }
            avg /= n;
            for(int i=0;i<n;i++){
                sum += Math.pow((student[i] - avg),2);
            }
            System.out.println(Math.sqrt(sum /= n));
        }
        sc.close();
    }
}
