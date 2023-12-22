import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String b="",g="";
        int bc=0,gc=0;
        for(int i=0;i<n;i++){
            b=sc.next();
            g=sc.next();
            if(b.compareTo(g)>0){
                bc+=3;
            }else if(b.compareTo(g)<0){
                gc+=3;
            }else{
                bc++;
                gc++;
            }
        }
        System.out.println(bc+" "+gc);
        sc.close();
    }
}
    
