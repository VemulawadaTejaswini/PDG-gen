import java.util.*;


class Main{

    int n=0,m=1;
    
    Main(){
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<6;i++){
            int a=sc.nextInt();
            n=n+a*m;
            
            if(i%2==0)m*=5;
            else m*=2;
        }

        if(n>=1000)n=1;
        else n=0;
        System.out.println(n);
    }

    public static void main(String[] args){
        new Main();
    }
}