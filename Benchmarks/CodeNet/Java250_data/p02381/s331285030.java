import java.util.Scanner;

public class Main {

	static double avg( int num, int member[] ) {
		double avg = 0;
		int sum = 0;

		for ( int i = 0 ; i < num ; i++ ) {
			sum += member[i];
		}

		avg = (double)sum / (double)num;

		return avg;
	}

	static double std_dev( int num, int member[], double avg ) {
		double std_dev = 0;

		for ( int i = 0 ; i < num ; i++ ) {
			std_dev += Math.pow( ( member[i] - avg ), 2 );
		}

		std_dev =  Math.sqrt( std_dev / num );

		return std_dev;
	}

	public static void main(String[] args) {

		int student_num = 0;
		int[] score;
		double score_avg = 0;
		double std_dev = 0.0;

		Scanner sc= new Scanner( System.in );

		while( true ) {

			student_num = sc.nextInt();

			if( student_num == 0) {
				break;
			}

			score = new int[student_num];

			for ( int i = 0; i < student_num ; i++ ) {
				score[i] = sc.nextInt();
			}

			score_avg = avg( student_num, score );

			std_dev = std_dev( student_num, score, score_avg );

			System.out.println( std_dev );
		}
		sc.close();
	}
}
