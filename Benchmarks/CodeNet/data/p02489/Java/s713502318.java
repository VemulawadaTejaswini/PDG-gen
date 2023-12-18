import java.util.ArrayList;

class Main {
	public static void main(String[] args){
    int index=0;
    ArrayList<Integer> ar = new ArrayList<Integer>();
	while(true){
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int num = scanner.nextInt();
		ar.add(num);
		if(ar.get(index)==0){
			scanner.close();
			break;
		}
		index++;
	}
	
	for(int i=0;i<index;i++){
	int	num=i+1;
		System.out.println("Case"+num+": "+ar.get(i));
	}
	}
}