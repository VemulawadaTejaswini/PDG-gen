import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        String s=sc.next();
  		String[] a=s.split("");
        Long b=sc.nextLong();
		int ans=1;
		
		for(int c=0;c<a.length;c++){
    		if(b>0){
             if(a[c].equals("1")){
             	b--;
             }else{
                ans=Integer.parseInt(a[c]);
                break;
             }
            }else{
            ans=1;
            }
    	}
    

    	System.out.println(ans);
    }
}
