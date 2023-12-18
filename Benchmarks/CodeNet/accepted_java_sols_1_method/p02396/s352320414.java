import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0,x=0;
        while(true){
            x=sc.nextInt();
            count++;
            if(x==0) break;
            else{
                System.out.println("Case "+count+": "+x);
                
            }
        }
    }
}
