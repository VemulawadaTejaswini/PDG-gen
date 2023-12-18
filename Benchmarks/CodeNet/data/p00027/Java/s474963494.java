import java.io.*;
import java.util.StringTokenizer;

class Calendar2004 {
    int MonthDays[] = new int[12];

    Calendar2004() {
	for (int i=0;i<12;i++) {
	    if (i==1) this.MonthDays[i] = 29;
	    else if (i==3||i==5||i==8||i==10) this.MonthDays[i] = 30;
	    else this.MonthDays[i] = 31;
	}
    }

    int SumofDays(int m,int d) {
	int sum = 0;
	for (int i=0;i<m-1;i++) {
	    sum += this.MonthDays[i];
	}
	return sum+d;
    }

    String Day(int m,int d) {
	switch (SumofDays(m,d)%7) {
	case 1: return "Thursday";
	case 2: return "Friday";
	case 3: return "Saturday";
	case 4: return "Sunday";
	case 5: return "Monday";
	case 6: return "Tuesday";
	case 0: return "Wednesday";
       	}
	return "Error";
    }
}

class Main {
    public static void main(String args[]) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String buf;

	try {
	    Calendar2004 c = new Calendar2004();
	    while ((buf = br.readLine())!=null) {
		StringTokenizer st = new StringTokenizer(buf);
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		if (month==0) break;
		System.out.println(c.Day(month,day));
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    } 
}