import java.util.Scanner;
class Main{
	public static void main(String[]args){
    
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0,y=0;
            for(int i=0;i<n;i++){
                String s1=sc.next();
                String s2=sc.next();
                if(s1.compareTo(s2)<0){
                    y+=3;
                }else if(s1.compareTo(s2)>0){
                    x+=3;
                }else{
                    x+=1;
                    y+=1;
                }
            }
        System.out.println(x+" "+y);
	}
}
