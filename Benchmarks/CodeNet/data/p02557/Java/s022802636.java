import java.util.*;
public class Main2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

      	int length = sc.nextInt();
      	int nums[] = new int[length];
      	int nums2[] = new int[length];
      	for( int i = 0; i < length; i++ ) {
			nums[i] = sc.nextInt();
        }
      	for( int i = 0; i < length; i++ ) {
			nums2[i] = sc.nextInt();
		}
		
		int res[] = new int[length];

		int numscount[][] = new int[2][length + 1];
		int numscount2[][] = new int[2][length + 1];
      	
		for( int i = 0; i < length - 1; i++ ) {
			for( int j = 0; j < length; j++ ) {
				if(numscount[0][j] == nums[i]) {
					numscount[i][j]++;
					break;
				}
				if(numscount[0][j + 1] == 0 && numscount[0][j] == 0 && numscount[0][j] == 0) {
					numscount[0][j] = nums[i];
					numscount[1][j]++;
				}
			}
		}
		for( int i = 0; i < length - 1; i++ ) {
			for( int j = 0; j < length; j++ ) {
				if(numscount2[0][j] == nums2[i]) {
					numscount2[1][j]++;
					break;
				}
				if(numscount2[0][j + 1] == 0 && numscount2[0][j] == 0 && numscount2[0][j] == 0) {
					numscount2[0][j] = nums2[i];
					numscount2[1][j]++;
				}
			}
		}
	
		for( int i = 0; i < length; i++ ) {
			for( int j = 0; j < length; j++ ) {
				if(numscount[0][j] == 0) {
					break;
				}
			}
		}

		sc.close();
      	System.out.println("1");
	}
}