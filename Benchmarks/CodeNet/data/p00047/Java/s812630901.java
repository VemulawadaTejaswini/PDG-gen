import java.util.Scanner;
	public class Main{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int cap[] = {1,0,0};
			int temp;
			int n1=0;
			int n2=0;
			while(sc.hasNext()){
				String str = sc.nextLine();
				String[] ch = str.split(",");
				if(ch[0]=="A"){
					 n1 = 0;
				}else if(ch[0]=="B"){
					 n1 = 1;
				}else if(ch[0]=="C"){
					 n1 = 2;
				}
				if(ch[1]=="A"){
					 n2 = 0;
				}else if(ch[1]=="B"){
					 n2 = 1;
				}else if(ch[1]=="C"){
					 n2 = 2;
				}
				temp = cap[n1];
				cap[n1]=cap[n2];
				cap[n2]=temp;
			}
			for(int i=0;i<3;i++){
				if(cap[i]==1){
					if(i+1 == 1 ){
						System.out.println("A");
						break;
					}else if(i+1 == 2){
						System.out.println("B");
						break;
					}else if(i+2 == 3){
						System.out.println("C");
						break;
					}
					
				}
			}
		}
	}		