import java.util.*;
public class Main {
	public static void main(String[] args){
	 
	Scanner sc= new Scanner (System.in);
	
	while (sc.hasNext()) {	
	int i[];
	i = new int[3];
		for(int d=0;d<3;d++ ){
			i[d]=sc.nextInt();
			Arrays.sort(i);
			
		}
	if((i[2]*i[2])==(i[0]*i[0])+(i[1]*i[1])){
		System.out.println("Yes");
	}
	else System.out.println("No");	
	}	
		
	 
	
	}

}