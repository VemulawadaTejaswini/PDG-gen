    import java.util.Scanner;

    public class Main {
    	public static void main(String[] args){
    		 Scanner sc = new Scanner(System.in);
    		 String insert = sc.next();
    		 final String SEIKAI_YEAR = "2018";


    		 System.out.println(insert.replace("2017",SEIKAI_YEAR));
    	}
    }