import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int[][] a=new int[3][3];
  		for(int c=0;c<3;c++){
    		a[c][0]=sc.nextInt();
          	a[c][1]=sc.nextInt();
          	a[c][2]=sc.nextInt();
    	}
  
        int n=sc.nextInt();
		
  		int[] b=new int[n];
		for(int d=0;d<n;d++){
    		b[d]=sc.nextInt();
           for(int c=0;c<3;c++){
           		if(a[c][0]==b[d]){
                	a[c][0]=0;
                }else if(a[c][1]==b[d]){
                	a[c][1]=0;
                }else if(a[c][2]==b[d]){
                	a[c][2]=0;
                }
           }
    	}
  		int ans=0;
  
  for(int c=0;c<3;c++){  
 	if(a[c][0]==0&&a[c][1]==0&&a[c][2]==0){
    		ans=1;
    	}
  }
  for(int c=0;c<3;c++){  
 	if(a[0][c]==0&&a[1][c]==0&&a[2][c]==0){
    		ans=1;
    	}
  }
  
  if(a[0][0]==0&&a[1][1]==0&&a[2][2]==0){
    		ans=1;
    	}
   if(a[0][2]==0&&a[1][1]==0&&a[2][0]==0){
    		ans=1;
    	}
	if(ans==1){
    	System.out.println("Yes");
    }else{
    System.out.println("No");
    }
    }
}

