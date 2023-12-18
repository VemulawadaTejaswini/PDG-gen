import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int min=0,max=0,x;
        Long sum=0L;
        
        for(int i=0;i<num;i++){
            x=sc.nextInt();
            if(i==0){
                min=x;
                max=x;
            }
            else{
                if(max<x){
                    max=x;
                }else if(min>x){
                    min=x;
                }else{
                    
                }    
            }
            sum=sum+x;
        }  
        System.out.println(min+" "+max+" "+sum);
    }    
}
