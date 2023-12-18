import java.util.Scanner;
public class Main {
	

		public static void main(String [] args) {
				
			Scanner in = new Scanner(System.in);
			
				
			int n = in.nextInt();
			String [] arr = new String [n];
			String [] arr2 = new String [n];
			
				
			for(int i = 0; i < n; i++) {
					String s = in.next();
					arr[i] = s;
					arr2[i] = s;
				}
			
			
			for(int j = 0; j < n - 1; j++) {
				
				
				for(int h = n - 1; h > j ; h--) {
					int cardVal = Integer.parseInt(arr[h].replaceAll("\\D", ""));
					int cardVal2 = Integer.parseInt(arr[h - 1].replaceAll("\\D", ""));
					if(cardVal < cardVal2) {
						String temp = arr[h];
						arr[h] = arr[h - 1];
						arr[h - 1] = temp;
						
					}
				}
			}
			
			for(int k = 0; k < n; k++) {
				System.out.print(arr[k]);
				
				if(k != n - 1) {
					System.out.print(" ");
				}
			}
			
			System.out.println("\nStable");
			
			
			String stable = "Stable";
			for(int j = 0; j < n; j++) {
				
				
				int minIndex = j;
				int jCardVal = Integer.parseInt(arr2[j].replaceAll("\\D", ""));
				boolean existsEqual = false;
				int equalIndex = Integer.MAX_VALUE;
				
				
				for(int h = j + 1; h < n; h++) {
					int cardVal = Integer.parseInt(arr2[h].replaceAll("\\D", ""));
					int cardVal2 = Integer.parseInt(arr2[h - 1].replaceAll("\\D", ""));
					
					if(cardVal == jCardVal) {
						existsEqual = true;
						equalIndex = h;
					}
					if(cardVal < cardVal2) {
						minIndex = h;
						
					}
					
					
				}
				
				if(j != minIndex) {
					String temp = arr2[j];
					arr2[j] = arr2[minIndex];
					arr2[minIndex] = temp;
					if(existsEqual && minIndex > equalIndex) {
						stable = "Not Stable";
					}
				}
			}
			for(int k = 0; k < n; k++) {
				System.out.print(arr2[k]);
				
				if(k != n - 1) {
					System.out.print(" ");
				}
			}
			
			System.out.println("\n" + stable);
			
		}
	}



