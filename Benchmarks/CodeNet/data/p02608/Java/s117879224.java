import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        
      for(int a=1;a<=n;a++){
		for(int c=1;c<Math.sqrt(n);c++){
    		for(int d=c;d<Math.sqrt(n-c*c);d++){
            for(int e=d;e<Math.sqrt(n-c*c);e++){
              int an=c*c+d*d+e*e+c*d+c*e+d*e;
             if(an==a){
               if(c==d&&d==e){
              ans++;
               }else if(c==d||d==e||e==c){
               ans+=3;
               }else{ans+=6;}
          
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
