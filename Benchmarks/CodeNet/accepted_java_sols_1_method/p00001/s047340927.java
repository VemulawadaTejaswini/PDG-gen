import java.util.Scanner;
class Main{

	
	public static void main(String[] a) {
		Scanner keyboad=new Scanner(System.in);
			int yama[]=new int[10];
			for(int i=0;i<10;i++){
				yama[i]=keyboad.nextInt();
			}
			int mob=0;
			int ans[]=new int[3];
			int mem[]=new int[3];
			for(int j=0;j<3;j++){
			for(int i=0;i<10;i++){
				if(i==0){
					mob=yama[i];
				}
				else{
					if(mob<yama[i]){
						mob=yama[i];
						mem[j]=i;
					}
				}
				ans[j]=mob;
			}
		yama[mem[j]]=-1;
			}
			for(int i=0;i<3;i++){
				System.out.println(ans[i]);
			}
	}

}