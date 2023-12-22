import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();List<String> B=new ArrayList<>(),S=new ArrayList<>();
		for(int i=0;i<n;i++) {
			B.add(cin.next());S.add(B.get(i));
		}
		
		//bubble
		boolean flag=true;
		while(flag) {
			flag=false;
			for(int i=n-1;i>0;i--) {
				char c1[]=B.get(i).toCharArray(),c2[]=B.get(i-1).toCharArray();
				if(c1[1]<c2[1]) {
					Collections.swap(B, i, i-1);
					flag=true;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(B.get(i));
			if(i!=n-1)System.out.print(" ");
		}
		System.out.println();
		System.out.println("Stable");
		
		//Selection
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				char c1[]=S.get(j).toCharArray(),c2[]=S.get(min).toCharArray();
				if(c1[1]<c2[1])min=j;
			}
			if(min!=i)Collections.swap(S, i, min);
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(S.get(i));
			if(i!=n-1)System.out.print(" ");
		}
		System.out.println();
		
		int c=0;
		for(int i=0;i<n;i++) {
			if(B.get(i).equals(S.get(i)))c++;
		}
		if(c==n)System.out.println("Stable");
		else System.out.println("Not stable");
	}

}

