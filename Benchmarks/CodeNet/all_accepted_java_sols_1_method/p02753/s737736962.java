import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
        String[] array = a.split("");
		

		if(array[0].equals(array[1]) && array[1].equals(array[2])){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}

	}

	}