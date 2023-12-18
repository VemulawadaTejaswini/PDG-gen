import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String[] a = new String[100];
		int[] c = new int[100];
		char[] cha = new char[100];
		int[] into = new int[100];
		int[] z = new int[100];
		String[] str = new String[100];
		char[][] x = new char[100][13];
		char[] chab = new char[100];
		int[] intb = new int[100];
		int flag = 1;
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++){
			str[i] = scan.next();
			
			char[] b = str[i].toCharArray();
			cha[i] = b[0];
			into[i] = Character.getNumericValue(b[1]);
			chab[i] = b[0];
			intb[i] = Character.getNumericValue(b[1]);
			
			x[into[i]][z[into[i]]] = b[0];
			z[into[i]]++;
		}
		
		while(flag==1){
			flag = 0;
			for(int j=n-1; j>0; j--){
				if(intb[j] < intb[j-1]){
					int kari = intb[j];
					intb[j] = intb[j-1];
					intb[j-1] = kari;
					char kar = chab[j];
					chab[j] = chab[j-1];
					chab[j-1] = kar;
					flag = 1;
				}
			}
		}
		
		for(int i=0; i<n; i++){
			System.out.print(chab[i]+""+intb[i]);
			if(i!=n-1){
				System.out.print(" ");
			}
			else{
				System.out.print("\n");
			}
		}
		
		System.out.println("Stable");
		
		for(int i=0; i<n; i++){
			int min = i;
			for(int j=i; j<n; j++){
				if(into[j] < into[min]){
					min = j;
				}
			}
			int kari = into[min];
			into[min] = into[i];
			into[i] = kari;
			char kar = cha[min];
			cha[min] = cha[i];
			cha[i] = kar;
		}
		
		for(int i=0; i<n; i++){
			System.out.print(cha[i]+""+into[i]);
			if(i!=n-1){
				System.out.print(" ");
			}
			else{
				System.out.print("\n");
			}
		}
		
		for(int i=0; i<12; i++){
			z[i] = 0;
		}
		
		int NN = 0;
		
		for(int i=0; i<n; i++){
			if(x[into[i]][z[into[i]]] != cha[i]){
				NN = 1;
				break;
			}
			z[into[i]]++;
		}
		
		if(NN==1){
			System.out.println("Not stable");
		}
		else{
			System.out.println("Stable");
		}
	}
}
