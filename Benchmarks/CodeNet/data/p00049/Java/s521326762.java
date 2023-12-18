import java.util.Scanner;
	public class Main{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int count[] = {0,0,0,0};
			while(sc.hasNext()){
				String str = sc.nextLine();
				String [] blood = str.split(",");
					if(blood[1]=="A"){
						count[0]++;
					}else if(blood[1]=="B"){
						count[1]++;
					}else if(blood[1]=="AB"){
						count[2]++;
					}else{
						count[3]++;
					}
			}
			for(int i = 0; i < 4; i++  ){
				System.out.println(count[i]);
			}
		}
	}		