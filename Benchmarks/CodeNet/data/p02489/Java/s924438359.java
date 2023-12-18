import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args){
    int num=1;
    int index=0;
    ArrayList<Integer> ar = new ArrayList<Integer>();
	while(true){
		ar.add(new  java.util.Scanner(System.in).nextInt());
		if(ar.get(index)==0){
			break;
		}
		index++;
	}
	for(int i=0;i<index;i++){
		System.out.println("case "+(i+1)+": "+ar.get(i));
	}
	}
}