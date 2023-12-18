import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String[] str = new String[2];
        int count = 0;
        while(in.hasNext()) {
            String buf = in.nextLine();
            str[count] = buf;
            count++;
        }
        Integer number = Integer.parseInt(str[0]);
        String[] split = str[1].split(" ");
        int[] facter; 
        facter = new int[split.length];
        
        for (int i = 0; i < split.length; i++) {
        	if (i != 0) {
        		System.out.print(" ");
        	}
        	facter[i] = Integer.parseInt(split[i]);
        	System.out.print(facter[i]);
        }
        System.out.println("");

        
        for (int i = 1; i <= (number -1); i++) {
        	int v = facter[i];
        	int j = i - 1;
        	
        	while ((j >= 0) && (facter[j] > v)) {
        		facter[j + 1] = facter[j];
        		j--;
        	}
        	facter[j + 1] = v;
        	
        	for ( int t = 0; t < split.length; t++) {
        		if (t != 0) {
        			System.out.print(" ");
        		}
        		System.out.print(facter[t]);
        	}
        	System.out.println("");

        	
        }
	}

}