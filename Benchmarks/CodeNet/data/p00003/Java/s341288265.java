import java.util.Scanner;
class Main{

	
	public static void main(String[] a) {
		Scanner keyboad=new Scanner(System.in);
		int i[]=new int[1000];
		int j[]=new int[1000];
		int l[]=new int[1000];
		int kai=keyboad.nextInt();
		
		for(int k=0;k<kai;k++){
		String str1 =keyboad.nextLine();
		String[] bun = str1.split(" ");
		
		i[k]= Integer.parseInt(bun[0]);
		j[k]= Integer.parseInt(bun[1]);
		l[k]= Integer.parseInt(bun[2]);
		}
		
		int mob[][]=new int[kai][3];
		int kau[][]=new int [kai][3];
		int max[][]=new int[kai][3];
		
			for(int b=0;b<kai;b++){
			for(int a=0;a<3;a++){
				if (i[b] > j[b]) {
					max[b][a] = i[b];
					mob[b][a] = i[b];
					kau[b][a]=1;
				} else {
					max[b][a] = j[b];
					mob[b][a] = j[b];
					kau[b][a]=2;
				}
				
				if (l[b] > max[b][a]) {
					max[b][a] = l[b];
					mob[b][a] = l[b];
					kau[b][a]=3;
				}
			if(kau[b][a]==1)i[b]=-1;
			else if(kau[b][a]==2)j[b]=-1;
			else if(kau[b][a]==3)l[b]=-1;
			}
	
			}
			for(int z=0;z<kai;z++){
				if(max[z][0]*max[z][0]==max[z][1]*max[z][1]+max[z][2]*max[z][2]){
					System.out.println("YES");
				}else System.out.println("NO");
			}
		}
		
	}