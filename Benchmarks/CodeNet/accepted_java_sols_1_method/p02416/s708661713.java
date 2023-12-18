import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String number[] = new String[9999];
    int Sum=0;
    int i=0;

    do{
      number[i] = scanner.nextLine();
      i++;
    }while(!(number[i-1].charAt(0)=='0'));

    for (int j=0; j<i-1; j++) {
      Sum = 0;
      for(int k=0;k<number[j].length();k++){
				Sum += (number[j].charAt(k)) - 48;
			}
			System.out.println(Sum);
    }
}
}
