import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        
        int N=stdIn.nextInt();
        int M=stdIn.nextInt();
        int count=0;
        int sum=0;
        
        int []a=new int[N];
        for(int i=0; i<N; i++){
            a[i]=stdIn.nextInt();
            sum+=a[i];
        }
        double Sum=sum/4.0/M;
        for(int i=0; i<a.length; i++){
            if(a[i]>=Sum){
                count++;
            }
        }
        if(count>=M){
            System.out.println("Yes");
            
        }
        else{
            System.out.println("No");
            
        }
        
    }

}