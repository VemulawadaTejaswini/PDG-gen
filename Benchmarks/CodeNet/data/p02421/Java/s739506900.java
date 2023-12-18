import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] tr = new String[count];
        String[] hnk = new String[count];

        int trScore = 0;
        int hnkScore = 0;

        for(int i=0; i<count; i++){
        	tr[i] = sc.next();
        	hnk[i] = sc.next();
        }
        for(int i=0; i<count; i++){
        	if(tr[i].compareTo(hnk[i]) > 0){
        		trScore = trScore + 3;
        	}
        	if(hnk[i].compareTo(tr[i]) > 0){
        		hnkScore = hnkScore + 3;
        	}
        	if(tr[i].compareTo(hnk[i]) == 0){
        		trScore++;
        		hnkScore++;
        	}
        }
        System.out.println(trScore+" "+hnkScore);
    }
}

