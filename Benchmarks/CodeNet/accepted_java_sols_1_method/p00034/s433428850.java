import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] length=new int[10];
        int L,V,v1,v2,sum,A;
        while(sc.hasNextLine()){
            L=0;
            V=0;
            v1=0;
            v2=0;
            sum=0;
            A=0;
            String s=sc.nextLine();
            String[] l=s.split(",");
            for(int i=0;i<10;i++){
                length[i]=Integer.parseInt(l[i]);
                L+=length[i];
            }
            v1=Integer.parseInt(l[10]);
            v2=Integer.parseInt(l[11]);
            V=v1+v2;
            A=L*v1;
            for(int i=0;i<10;i++){
                sum+=length[i];
                if(A<=(v1+v2)*sum){
                    System.out.println(i+1);
                    break;
                }
            }
        }
        
    }
}