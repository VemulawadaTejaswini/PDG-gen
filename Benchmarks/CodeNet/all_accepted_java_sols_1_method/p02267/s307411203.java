import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int i,j,cnt=0;
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
    	j=0;
    	while(j<hair1.length){
    		if(hair1[j]==hair2[i]){
    			cnt++;
    			break;
    		}
    		j++;
    		}
    	}
    System.out.println(cnt);
	}

}

