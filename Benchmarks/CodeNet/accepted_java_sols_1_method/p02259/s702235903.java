import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kazu,i,j,cnt=0,hz;
		Scanner sca = new Scanner(System.in);
		kazu=sca.nextInt();
		int hai[]=new int[kazu];
		for(i=0;i<kazu;i++){
			hai[i]=sca.nextInt();
		}
       for(i=0;i<kazu-1;i++){
    	   for(j=kazu-1;j>0;j--){
    		   if(hai[j]<hai[j-1]){
    			   hz=hai[j];
    			   hai[j]=hai[j-1];
    			   hai[j-1]=hz;
    			   cnt++;
    		   }
    	   }
	}
     for(i=0;i<kazu;i++){
    if(i!=kazu-1){	 
     System.out.print(hai[i]+" ");
     }else{
    	 System.out.println(hai[i]);
     }
     }
     System.out.println(cnt);

}
}
