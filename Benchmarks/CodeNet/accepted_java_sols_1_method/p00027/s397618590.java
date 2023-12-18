import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	int year = 2004;
	int month = sc.nextInt();
	int day = sc.nextInt();
	while(month!=0){
	    year = 2004;
	    if(month==1 || month==2){
		year--;
		month += 13;
	    }else{month += 1;}
	    
	    int a = (int)(year*365.25);
	    int b = (int)(month*30.6);
	    int c = year/400;
	    int d = year/100;
	    int e = a+b+c+day-d-429;
	    int f = (int)(e/7)*7;
	    int ans = e-f;
	    
	    String today = "";
	    if(ans==0){today = "Monday";}
	    if(ans==1){today = "Tuesday";}
	    if(ans==2){today = "Wednesday";}
	    if(ans==3){today = "Thursday";}
	    if(ans==4){today = "Friday";}
	    if(ans==5){today = "Saturday";}
	    if(ans==6){today = "Sunday";}
	    
	    System.out.println(today);

	    month = sc.nextInt();
	    day = sc.nextInt();
	}
    }
}