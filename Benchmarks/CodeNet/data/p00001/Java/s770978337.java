

public class main{
public static void main(String args[]){
	
	int largest=0;
	int largest2=0;
	int largest3=0;
	
	for(int i=0;i<args.length;i++){
		if(Integer.parseInt(args[i])>largest){
			largest3=largest2;
			largest2=largest;
			largest=Integer.parseInt(args[i]);
		}
		i++;
	}
	System.out.println(largest);
	System.out.println(largest2);
	System.out.println(largest3);
}
}