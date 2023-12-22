import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        if(x==3 || x==2){
            System.out.println(x);
            return;
        }
        if(x==1){
            System.out.println(2);
            return;
        }

        for(int i=0; i<=100003; i++){
            for(int j=2; j*j<=x+i; j++){
                if((x+i)%j==0){
                    break;
                }
                if((j+1)*(j+1)>x+i){
                    System.out.println(x + i);
                    return;
                }
            }
        }
    }
}