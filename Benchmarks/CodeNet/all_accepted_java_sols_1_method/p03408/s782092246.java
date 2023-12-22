import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    
    String[] s=new String[n];
    
    for(int i=0;i<n;i++){
    	s[i] = scan.next();
    }

    int m = scan.nextInt();
    

    String[] t=new String[m];
    
    for(int i=0;i<m;i++){
    	t[i] = scan.next();
    }
    
    int point=0;
    
    int count=0;
    
    for(int i=0;i<n;i++){
    	count=0;
    	for(int j=0;j<n;j++){
    		if(s[i].equals(s[j])){
    			count++;
    		}
    	}
    	for(int k=0;k<m;k++){
    		if(s[i].equals(t[k])){
    			count--;
    		}
    	}
    	if(count>point){
    		point=count;
    	}
    }

	System.out.println(point);


  }
}