import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
      for(int a=1;a<=n;a++){
		for(int c=1;c<Math.sqrt(n);c++){
    		for(int d=1;d<Math.sqrt(n);d++){
            for(int e=1;d<Math.sqrt(n);e++){
              int an=c*c+d*d+e*e+c*d+c*e+d*e;
             if(an==a){
              ans++;
             }else if(an>a){
               break;}
            }
            }
    	}
        System.out.println(ans);
        ans=0;
      }
    

    	
    }
}
