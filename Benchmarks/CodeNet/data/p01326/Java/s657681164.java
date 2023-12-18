import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int y;
		int	values;
		int	byteSize;
		String[] bitPatturn;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();


		while((byteSize = Integer.parseInt(bufferedReader.readLine())) != 0){
			y = 0;
			values		= 1;

			bitPatturn = new String[byteSize];

			for(int i = 0; i < byteSize; i++){
				bitPatturn[i]= bufferedReader.readLine();
			}

			if(byteSize == 1){
				for(int k = 1; k < 8; k++)	if(bitPatturn[0].charAt(k) == 'x') values *= 2;
			}else{
				for(int i = 0; i < byteSize; i++){
					if(i == 0){
						for(int j = 3; j < 8; j++){
							switch(byteSize){
								case 2:
									if(3 <= j && j <= 6){
										if(bitPatturn[i].charAt(j) == '1')	y++;
										else if(bitPatturn[i].charAt(j) == 'x') values *= 2;
									}else if(j == 7 && bitPatturn[i].charAt(j) == 'x'){ values *= 2;}
									break;
								case 3:
									if(4 <= j && j <= 7){
										if(bitPatturn[i].charAt(j) == '1')	y++;
										else if(bitPatturn[i].charAt(j) == 'x') values *= 2;
									}
									break;
								case 4:
									if(5 <= j && j <= 7){
										if(bitPatturn[i].charAt(j) == '1')	y++;
										else if(bitPatturn[i].charAt(j) == 'x') values *= 2;
									}
									break;
							}
						}
					}
					else if(i == 1 && byteSize == 2){
						for(int j = 2; j < 8; j++)	if(bitPatturn[i].charAt(j) == 'x') values *= 2;
					}else if(i == 1 && byteSize == 3){
						for(int j = 2; j < 8; j++){
							if(j == 2){
								if(bitPatturn[i].charAt(j) == '1')	y++;
								else if(bitPatturn[i].charAt(j) == 'x') values *= 2;
							}else{
								if(bitPatturn[i].charAt(j) == 'x') values *= 2;
							}
						}
					}else if(i == 1 && byteSize == 4){
						for(int j = 2; j < 8; j++){
							if(j == 2 || j == 3){
								if(bitPatturn[i].charAt(j) == '1')	y++;
								else if(bitPatturn[i].charAt(j) == 'x') values *= 2;
							}else{
								if(bitPatturn[i].charAt(j) == 'x') values *= 2;
							}
						}
					}else if(i == 2 || i == 3){
						for(int j = 2; j < 8; j++)	if(bitPatturn[i].charAt(j) == 'x') values *= 2;
					}
				}

				if(values == 1)				values--;
				if(y == 0 && values != 0)	values -= 1;

				System.out.println("Y = " + y);
			}
			list.add(values % 1000000);
		}

		for(Integer val : list)	System.out.println(val.intValue());
	}
}