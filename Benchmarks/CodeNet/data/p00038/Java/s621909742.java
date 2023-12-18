import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int[] card=new int[5];
			int[] equal=new int[5];
			int equalcount=0;
			String[] str=sc.next().split(",");
			for(int i=0;i<5;i++){
				card[i]=Integer.parseInt(str[i]);
			}
			for(int i=0;i<5;i++){
				for(int j=4;j>i;j--){
					if(card[j-1]>card[j]){
						int box=card[j-1];
						card[j-1]=card[j];
						card[j]=box;
					}
				}
			}
			for(int i=0;i<5;i++){
				for(int j=0;j<5;j++){
					if(card[i]==card[j]){
						equal[i]++;
					}
				}
			}
			for(int i=0;i<5;i++){
				if(equal[i]==2){
					equalcount++;
				}
			}
			if(equal[0]==4||equal[1]==4){
				System.out.println("four card");
			}else if(equal[1]==2&&equal[2]==3||equal[2]==3&&equal[3]==2){
				System.out.println("full house");
			}else if(equal[2]==3){
				System.out.println("three card");
			}else if(equalcount==4){
				System.out.println("two pair");
			}else if(equalcount==2){
				System.out.println("one pair");
			}else if(card[1]==card[0]+1&&card[2]==card[1]+1&&card[3]==card[2]+1&&card[4]==card[3]+1){
				System.out.println("straight");
			}else if(card[0]==1&&card[1]==10&&card[2]==11&&card[3]==12&&card[4]==13){
				System.out.println("straight");
			}else{
				System.out.println("null");
			}
		}
	}
}