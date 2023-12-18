public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		class qube{
			Scanner sc = new Scanner(System.in);
			int [] face = new int[6],faces;
			Integer i,dump=0;
			Integer a,b,n;
			int ec=0,nc=0;
			

			qube(){
				for(i=0;i<6;i++){
					face[i]=sc.nextInt();
				}
				n = sc.nextInt();
				faces = face.clone();
			}

			void swap(int a,int b){
				dump = this.face[a];
				this.face[a] = this.face[b];
				this.face[b] = dump;

			}
			void scn(){
				a = sc.nextInt();
				b = sc.nextInt();
			}
			void pt(){
				System.out.printf("%d\n", this.face[2]);
			}

			void move(String es){
				if(es.equals("E")){
					if(ec == 3){
						this.move("N");
						nc = 0;
					}
					else if(ec == 6){
						this.move("N");
						nc = 0;
					}
					swap(0,2);
					swap(0,5);
					swap(0,3);
					ec++;
				}
				else if(es.equals("N")){
					/*if(nc == 3){
						this.move("E");
						ec = 0;
					}
					if(nc == 6){
						this.move("E");
						ec = 0;
					}*/
					swap(4,5);
					swap(4,1);
					swap(4,0);
					//nc++;
				}
				
			}

		}
		int j;

		qube q = new qube();
		for(j=0;j<q.n;j++){
			q.scn();
			
			while(true){
				if(q.b.equals(q.face[1])){
					break;
				}
				q.move("E");
			}
			while(true){
				if(q.a.equals(q.face[0])){
					break;
				}
				q.move("N");
			}
			q.pt();
			q.face = q.faces.clone();
		}
		
	}
