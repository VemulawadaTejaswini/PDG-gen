import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int s=sn.nextInt();
		int[] card=new int[101];
		int alice=0;
        int bob=0;
		for(int i=0;i<s;i++) {
			card[i]=sn.nextInt();
		}
		int max=0,save=0;
		for(int i=0;i<s;i++) {
			for(int j=0;j<s;j++) {
				if(card[i]>card[j]) {
					save=card[j];
					card[j]=card[i];
					card[i]=save;
				}
			}
		}
		for(int i=0;i<s;i++) {
			if(i%2==0){
              alice+=card[i];
            }else{
              bob+=card[i];
            }
		}
		System.out.println(alice-bob);
	}
}