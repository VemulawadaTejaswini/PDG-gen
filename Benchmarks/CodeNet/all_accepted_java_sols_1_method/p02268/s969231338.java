import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int i,cnt=0,big,sma,mid;
		// TODO Auto-generated method stub
   Scanner sca=new Scanner(System.in);
    int hair1[]=new int[sca.nextInt()];
    for(i=0;i<hair1.length;i++){
    	hair1[i]=sca.nextInt();
    }
    int hair2[]=new int[sca.nextInt()];
    for(i=0;i<hair2.length;i++){
    	hair2[i]=sca.nextInt();
    }
    for(i=0;i<hair2.length;i++){
    	big=hair1.length;
    	sma=0;
    	while(sma<big){
    		mid=(big+sma)/2;
    		if(hair1[mid]==hair2[i]){
    			cnt++;
    			break;
    		}
    		if(hair1[mid]>hair2[i])big=mid;
    		if(hair1[mid]<hair2[i])sma=mid+1;
    		}
    	}
    System.out.println(cnt);
	}

}
