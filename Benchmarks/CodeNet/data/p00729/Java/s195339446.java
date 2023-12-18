import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int pc_num = sc.nextInt();
			int student_num = sc.nextInt();
			if(pc_num==0) break;
			int record_num = sc.nextInt();

			Student[] person = new Student[student_num];
			for(int i=0; i<student_num; i++){
				person[i] = new Student(new int[record_num], new int[record_num/2]);
			}

			int t, n, m, s;
			for(int i=0; i<record_num; i++){
				t = sc.nextInt();	n = sc.nextInt();
				m = sc.nextInt();	s = sc.nextInt();
				m--;
				if(s==1){
					if(person[m].using++ == 0){
						person[m].time[person[m].index++] = t;
					}
				}else{
					if(--person[m].using == 0){
						person[m].time[person[m].index] = t;
						person[m].length[person[m].index/2] = person[m].time[person[m].index]
						- person[m].time[person[m].index-1];
						person[m].index++;
					}
				}
			}

			int q_num = sc.nextInt();

			int ts, te;
			int is, ie;
			for(int i=0; i<q_num; i++){
				ts = sc.nextInt();
				te = sc.nextInt();
				m = sc.nextInt();
				m--;

				is = Arrays.binarySearch(person[m].time, 0, person[m].index, ts);
				if(is<0) is = -is-1;
				ie = Arrays.binarySearch(person[m].time, 0, person[m].index, te);
				if(ie<0) ie = -ie-1;

				int sum = 0;
				if(is%2==0){
					if(is!=person[m].index){
						for(int j=is/2; j<ie/2; j++){
							sum += person[m].length[j];
						}
						if(ie%2==1){
							sum += (te - person[m].time[ie-1]);
						}
					}
				}else{
					sum += (person[m].time[is-1] - ts);
					for(int j=is/2; j<ie/2; j++){
						sum += person[m].length[j];
					}
					if(ie%2==1){
						sum += (te - person[m].time[ie-1]);
					}
				}

				System.out.println(sum);
			}
		}
	}

	public static class Student{
		int using = 0;
		int[] time = null;
		int[] length = null; 
		int index = 0;
		Student(int[] temp1, int[] temp2){
			time = temp1;
			length = temp2;
		}
	}
}