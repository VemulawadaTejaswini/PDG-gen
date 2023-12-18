import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[]height=new int[10];
	for(int i=0;i<10;i++){
	    height[i]=sc.nextInt();
	}
	int max=0;

	int[]top={-1,-1,-1};

	for(int i=0;i<3;i++){
	    for(int j=0;j<10;j++){
		if(j!=top[0]&&j!=top[1]&&j!=top[2]){
		    if(max<height[j]){
			top[i]=j;
			max=height[j];
		    }
		}
	    }
	max=0;	   
	}
	for(int i=0;i<3;i++) {
	    System.out.println(height[top[i]]);
	}
    }
}