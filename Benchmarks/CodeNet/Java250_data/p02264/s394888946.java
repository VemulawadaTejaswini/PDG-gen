import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int sTime = scan.nextInt();
			Process[] schedule = new Process[n];
			int count = n;
			int j = 0;
			int sumTime = 0;
			for(int i = 0;i < n;i++){
				schedule[i] = new Process(scan.next(),scan.nextInt());
			}
			int a = 0;
			int len = schedule.length;
			while(count > 1){
				if(count < len/2 && j == len && count > 1000){
					Process[] newSchedule = new Process[count];
					int k = 0;
					for(int i = 0;i < len;i++){
						if(schedule[i].getTime() == 0){
							continue;
						}
						newSchedule[k] = new Process(schedule[i].getName(),schedule[i].getTime());
						k++;
					}
					schedule = newSchedule;
					len = schedule.length;
					j = 0;
				}
				if(j >= len){
					j %= len;
				}
				a = schedule[j].getTime();
				if(a == 0){
					j++;
					continue;
				}else if(a <= sTime){
					sumTime += a;
					System.out.println(schedule[j].getName() + " " + sumTime);
					schedule[j++].setTime(0);
					count--;
					continue;
				}
				sumTime += sTime;
				schedule[j++].minusTime(sTime);
			}
			for(int i = 0;i < len;i++){
				if(schedule[i].getTime() == 0){
					continue;
				}
				System.out.println(schedule[i].getName() + " " +(sumTime+schedule[i].getTime()));
				break;
			}
		}
	}
	class Process{
		String name;
		int time;
		public Process(){
		}
		public Process(String name,int time){
			this.name = name;
			this.time = time;
		}
		public int getTime(){
			return this.time;
		}
		public void setTime(int time){
			this.time = time;
		}
		public String getName(){
			return this.name;
		}
		public void minusTime(int time){
			this.time -= time;
		}
		public void setName(String name){
			this.name = name;
		}
	}
}