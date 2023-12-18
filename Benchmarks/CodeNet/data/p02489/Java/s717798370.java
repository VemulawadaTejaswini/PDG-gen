import java.util.ArrayList;

class Main {
	public static void main(String[] args){
    int index=0;
    ArrayList<Integer> ar = new ArrayList<Integer>();
	while(true){
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		ar.add(scanner.nextInt());
		if(ar.get(index)==0){
			break;
		}
		index++;
	}
	for(int i=0;i<index;i++){
		System.out.println("Case"+(i+1)+": "+ar.get(i));
	}
	}
}