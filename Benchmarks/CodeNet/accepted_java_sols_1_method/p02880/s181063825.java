import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
  	int a=0;
    for(int c=1;c<10;c++){
    if(n%c==0&&(n/c)<10){
    a=1;
    }
    }
    if(a==1){
    System.out.println("Yes");
    }else{
     System.out.println("No");
    }
    }
}
