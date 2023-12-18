import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[][] color = new int[s.nextInt()][3];

		int count = s.nextInt();
		int sum = count * color.length;
		char[] line = null;
		int sub = 0;
		int sub_2 = 0;
		int sub_3 = 0;
		int sub_4 = 0;

		for(int i = 0; i < color.length; i++)
			for(int j = 0; j < 3; j++)
				color[i][j] = 0;

		for(int i = 0; i < color.length; i++){

			line = s.next().toCharArray();

			for(int j = 0; j < count; j++){

				if(line[j] == 'W')
					color[i][0]++;
				else if(line[j] == 'B')
					color[i][1]++;
				else
					color[i][2]++;

			}

		}

		s.close();

		for(int i = 0; i < color.length - 2; i++){

			for(int j = i + 1; j < color.length - 1; j++){

				for(int k = 1; (k <= i && i != 0); k++)
					sub_2 += count - color[k][0];
				for(int l = i + 1; l <= j; l++)
					sub_3 += count - color[l][1];
				for(int m = j + 1; m < color.length - 1; m++)
					sub_4 += count - color[m][2];
				sub = sub_2 + sub_3 + sub_4;

				if(sub < sum)
					sum = sub;

				sub_2 = sub_3 = sub_4 = 0;

			}

		}


		sum += count - color[0][0];
		sum += count - color[color.length - 1][2];


		System.out.println(sum);

	}

}