import java.util.*;

public class Main{

	public static void main(String[] args) {
		int n,x,c;
		while(true){
		c = 0;	
		Scanner scn = new Scanner(System.in);
		String inl = scn.nextLine();
		String[] part = inl.split(" ");
		n = Integer.parseInt(part[0]);
		x = Integer.parseInt(part[1]);
		if(n == 0 && x == 0) break;
		else{
			for(int i = 1 ; i < n-1 ; i++){
				for(int j = i + 1 ; j < n ; j++){
					for(int k = j + 1 ; k <=n ; k++){
						if(i + j + k == x) {
							c++;
							break;
						}
					}
				}
			}
System.out.println(c);
		}
		
		}

	}

}