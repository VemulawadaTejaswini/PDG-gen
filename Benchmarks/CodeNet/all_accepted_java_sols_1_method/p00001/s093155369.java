import java.util.*;
public class Main {
	public static void main(String[] args) {
		int[] intheight  = new int[10];
		int[] intTopheight = new int[3];
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\n");
		for(int i=0;i<10;i++){
			intheight[i] = scan.nextInt();
		}
		for(int i=0;i<10;i++){
			for(int j=0;j<3;j++){
				if(intTopheight[j]<=intheight[i]){
					if(j==0){
						intTopheight[2]=intTopheight[1];
						intTopheight[1]=intTopheight[0];
						intTopheight[0]=intheight[i];
					}
					if(j==1){
						intTopheight[2]=intTopheight[1];
						intTopheight[1]=intheight[i];
					}
					if(j==2){
						intTopheight[2]=intheight[i];
					}
					break;
				}
			}
		}
		for(int k=0;k<3;k++){
			System.out.println(intTopheight[k]);
		}
	}

}