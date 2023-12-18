import java.util.Scanner;
public class Main{
    
    public void so(){
    Scanner sc=new Scanner(System.in);
    int a,sina,count,s;
    count=1;
    s=0;
    sina=0;
    a=sc.nextInt();
    while(a!=0){
        for(int i=0;i<a;a++){
            sina=sc.nextInt();
        }if(sina>=2){
            count++;
        }else if(sina==1){
            s++;
        }
        }
        if(count>=2){
            System.out.println(count+s);
        }else{
            System.out.println("NA");
        }
        count=1;
        s=0;
        a=sc.nextInt();
   
    }
    public static void main(String []args){
        Main obj=new Main();
        obj.so();
    }
}
            