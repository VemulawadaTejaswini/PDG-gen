import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int x,y,z;
        for(int i=1;i<=num;i++){
            x=i/10;
            y=i/100;
            z=i/1000;
            if(i%3==0 ||x%10==3 ||y%10==3 ||z%10==3||i%10==3){
                System.out.print(" "+i);
            }
            
        }
        System.out.println("");
        
    }
}
