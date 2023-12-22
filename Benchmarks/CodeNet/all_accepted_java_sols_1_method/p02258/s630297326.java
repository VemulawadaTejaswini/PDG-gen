import java.util.Scanner;
class Main{
    public static void main(String[]arge){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt(); 
        int[] R = new int[n];
                
        for(int i=0; i<n; i++){
            R[i]=sc.nextInt();
            } 
        int answer=R[1]-R[0];
        int min=R[0];
        for(int i=1; i<n; i++){
            
            if(answer<R[i] - min)
                answer=R[i]-min;
            if(R[i]<min){
                    min=R[i];
                }
            
            
        }
        System.out.println(answer);
    }
}